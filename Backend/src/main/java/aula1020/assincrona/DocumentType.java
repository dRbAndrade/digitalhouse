package main.java.aula1020.assincrona;

public enum DocumentType {
    CONFIDENTIAL("Reservado"),
    SECRET("Secreto"),
    TOPSECRET("Muito Secreto");

    private String type;

    DocumentType(String type){
        this.type = type;
    }

    public static int getTypeAsInt(DocumentType type){
        switch (type){
            case CONFIDENTIAL->{return 1;}
            case SECRET->{return 2;}
            case TOPSECRET->{return 3;}
            default -> {return -1;}
        }
    }

    public static DocumentType getTypeAsEnum(int type) {
        switch (type){
            case 1 -> {return CONFIDENTIAL;}
            case 2 -> {return SECRET;}
            case 3 -> {return TOPSECRET;}
            default -> {return null;}
        }

    }

    @Override
    public String toString() {
        return type;
    }
}
