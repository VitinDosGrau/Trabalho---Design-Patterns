public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager = new ConfigurationManager();
        ConfigLogger logger = new ConfigLogger();
        ConfigAuditor auditor = new ConfigAuditor();

        // Adiciona observadores
        configManager.addObserver(logger);
        configManager.addObserver(auditor);

        // Define algumas configurações
        configManager.setSetting("dbUrl", "jdbc:mysql://localhost:3306/mydb");
        configManager.setSetting("dbUser", "root");
        configManager.setSetting("theme", "dark");

        // Altera uma configuração existente
        configManager.setSetting("theme", "light");

        // Obtém uma configuração
        System.out.println("Configuração atual do tema: " + configManager.getSetting("theme"));
    }
}
