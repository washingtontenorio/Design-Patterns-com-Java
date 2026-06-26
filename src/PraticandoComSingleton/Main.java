public class Main {
    public static void main(String[] args) {
        System.out.println("=== Demonstração do Padrão Singleton ===\n");

        System.out.println("1. Singleton Eager:");
        SingletonEager.getInstance().mostrarMensagem();

        System.out.println("\n2. Singleton Lazy (sincronizado):");
        SingletonLazy.getInstance().mostrarMensagem();

        System.out.println("\n3. Singleton Double-Checked Locking:");
        SingletonDoubleChecked.getInstance().mostrarMensagem();

        System.out.println("\n4. Singleton via Enum:");
        SingletonEnum.INSTANCE.mostrarMensagem();

        System.out.println("\n5. Singleton com Holder (Bill Pugh):");
        SingletonHolder.getInstance().mostrarMensagem();

        System.out.println("\n=== Teste de unicidade ===");
        SingletonEager s1 = SingletonEager.getInstance();
        SingletonEager s2 = SingletonEager.getInstance();
        System.out.println("São a mesma instância? " + (s1 == s2));
    }
}