public class App {
    public static void main(String[] args) throws Exception {
    App app = new App();
    app.conversao();
    }

    public void utilizando_static(){
        // Não instancia só pega a variável
        Produto.inteiro1 = 10;
        Produto.inteiro2 = 20;

        // Instancia objeto para chamar a variável
        Veiculo v = new Veiculo();
        v.marca = "Ford";
        v.modelo = "KA";

        Veiculo m = new Veiculo();
        m.marca = "Fiat";
        m.modelo = "Uno";

        final String teste_final;
        teste_final = "Meu primeiro valor";
        // teste_final = "Meu segundorgg";
    }



    public void conversao(){
        String st1, st2, st3, st4;
        float real1, real2;
        int inteiro1, inteiro2;

        // String para real
        st1 = "1.2";
        real1 = (float) (new Float(st1).floatValue());
        System.out.println("String para real "+real1);
        
        // Real para string
        real2 = 3.5f;
        st2 = new Float(real2).toString();
        System.out.println("Real para String "+ st2);

        // String para inteiro
        st3 = "15";
        inteiro1 = Integer.parseInt(st3);
        System.out.println("String para inteiro "+ inteiro1);

        // Inteiro para String
        inteiro2 = 25;
        st4 = Integer.toString(inteiro2);
        System.out.println("Inteiro para String "+st4);
    }
}
