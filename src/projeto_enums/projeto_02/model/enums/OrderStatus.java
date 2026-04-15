package projeto_enums.projeto_02.model.enums;

public enum OrderStatus {

    PAGAMENTO_PENDENTE(0,"Pagamento_Pendente"){
        @Override
        public String orderStatusPrint() {
            return "O pagamento está sendo analisado";
        }
    },
    PROCESSANDO(1,"Processando"){
        @Override
        public String orderStatusPrint() {
            return "Seu pedido está em análise";
        }
    },
    ENVIADO(2,"Enviado"){
        @Override
        public String orderStatusPrint() {
            return "Seu pedido está a caminho.";
        }
    },
    ENTREGUE(3,"Entregue"){
        @Override
        public String orderStatusPrint() {
            return "Seu pedido chegou a sua casa.";
        }
    };

    private final int processNumber;
    private final String orderName;

    OrderStatus(int processNumber,String orderName){
        this.processNumber = processNumber;
        this.orderName = orderName;
    }

    public abstract String orderStatusPrint();

    public int getProcessNumber() {
        return processNumber;
    }

    public String getOrderName() {
        return orderName;
    }
}
