package projeto_POO.projeto_02.model.enums;

public enum ProductType {
    PRODUTO_DIGTAl(1),
    PRODUTO_FISICO(2);

    private final int code;

    private ProductType(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static ProductType fromCode(int code){
        for (ProductType pt : values()){
            if (pt.code == code){
                return pt;
            }
        }
        throw new IllegalArgumentException("Tipo de produto inválido: "+ code);
    }
}
