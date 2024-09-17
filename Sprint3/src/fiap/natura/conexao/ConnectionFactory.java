package fiap.natura.conexao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	// Instância única do Singleton
	private static ConnectionFactory instance;

	// Configurações de conexão com o banco de dados Oracle
	private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static String USERNAME = "";
	private static String PASSWORD = "";

	// Construtor privado para impedir a criação de múltiplas instâncias
	private ConnectionFactory() {
		// objeto para representar o arquivo contendo o login e a senha do banco
		Properties properties = new Properties();

		try (FileInputStream file = new FileInputStream("config.properties")) {
			// carrega o arquivo aberto para a memória para ser processado
			properties.load(file);

			// faz a leitura dos valores usando o método getProperty()
			USERNAME = properties.getProperty("USERNAME");
			PASSWORD = properties.getProperty("PASSWORD");			

			// Registrar o driver Oracle
			Class.forName(DRIVER);

		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Erro ao carregar o driver Oracle JDBC\n" + e);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Erro ao carregar o aquivo de propriedades\n" + e);
		} catch (IOException e) {
			throw new RuntimeException("Erro ao ler o arquivo de propriedades\n" + e);
		}
	}

	// Método que retorna a única instância da ConnectionFactory
	public static ConnectionFactory getInstance() {
		if (instance == null) {
			synchronized (ConnectionFactory.class) {
				if (instance == null) {
					instance = new ConnectionFactory();
				}
			}
		}
		return instance;
	}

	// Método para obter uma conexão com o banco de dados Oracle
	public Connection getConnection() {
		try {			
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao conectar na base de dados\n" + e);
		}		
	}
}
