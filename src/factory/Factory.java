package factory;

public class Factory {
    public Human getHuman(HumanType type) {
        Human human = null;
        switch (type){
            case DOCTOR -> human = new Doctor();
            case PATIENT -> human = new Patient();
            default -> throw new IllegalArgumentException("Wrong human type:" + type);
        }
        return human;
    }
}
