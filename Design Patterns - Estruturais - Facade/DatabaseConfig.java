import java.util.HashMap;
import java.util.Map;

// Configuração de banco de dados
class DatabaseConfig {
    private Map<String, String> settings;

    public DatabaseConfig() {
        settings = new HashMap<>();
        settings.put("dbUrl", "jdbc:mysql://localhost:3306/mydb");
        settings.put("dbUser", "root");
        settings.put("dbPassword", "password");
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public void displaySettings() {
        System.out.println("Configurações do Banco de Dados:");
        for (Map.Entry<String, String> entry : settings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
