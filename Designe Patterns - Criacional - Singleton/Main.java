public class Main {
    public static void main(String[] args) {
        // Obter a instância do ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Exibir configurações padrão
        configManager.displaySettings();

        // Modificar algumas configurações
        configManager.setSetting("theme", "dark");
        configManager.setSetting("language", "en-US");

        // Exibir configurações atualizadas
        configManager.displaySettings();

        // Obter a instância novamente e verificar se as configurações persistem
        ConfigurationManager anotherConfigManager = ConfigurationManager.getInstance();
        anotherConfigManager.displaySettings();
    }
}