package nilloferreiira.bank;

public class Account {
    private static final int MAX_LENGTH = 12;

    private String agencia;
    private String conta;
    private String nome;

    private double balance;

    private Log logger = new Log();

    public Account(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        setNome(nome);
    }

    public void setNome(String nome) {
        if(nome.length() > MAX_LENGTH) {
            this.nome = nome.substring(0, MAX_LENGTH);
        } else {
            this.nome = nome;
        }

        System.out.println(this.nome);
    }

    public boolean withdraw(double value) {
        if(balance < value ) {
            logger.out("Saldo insuficiente! Se saldo atual é de " +  balance);
            return false;
        } else {
            balance -= value;
            logger.out("Saque de " +  value + " efetuado com sucesso! Seu novo saldo é de " +  balance);
            return true;
        }
    }

    public void deposit(double value) {
        balance += value;
        logger.out("Deposito efetuado com sucesso! Seu novo saldo é de " +  balance);
    }

    @Override
    public String toString() {
        return "A conta de " + nome +  " " + agencia +  " / " + conta + " possui R$ " + balance;
    }
}
