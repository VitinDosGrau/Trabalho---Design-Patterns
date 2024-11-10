public class Main {
    public static void main(String[] args) {
        ConfigManagerFacade configManager = new ConfigManagerFacade();

        // Exibir todas as configurações
        configManager.displayAllSettings();

        // Modificar algumas configurações
        configManager.setDatabaseSetting("dbPassword", "newpassword");
        configManager.setUISetting("theme", "dark");

        // Exibir todas as configurações novamente para verificar as mudanças
        configManager.displayAllSettings();
    }
}