class ConfigAuditor implements ConfigObserver {
    @Override
    public void update(String key, String value) {
        System.out.println("Auditoria: Configuração " + key + " foi alterada para " + value);
    }
}
