public enum SingletonEnum {
    INSTANCE;

    public void mostrarMensagem() {
        System.out.println("Singleton via Enum (Recomendado por Joshua Bloch - Thread-safe nativo, serialização segura)");
    }
}