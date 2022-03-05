public class Cell {
    private boolean hidden;
    private  boolean flag;
    private String type;  // number, empty, bomb

    public Cell() {
        this.hidden = true;
        this.flag = false;
        this.type = "EMPTY";
    }

    public boolean isHidden() {
        return hidden;
    }

    public boolean isFlag() {
        return flag;
    }

    public String getType() {
        return type;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public void setFlag(boolean hasFlag) {
        this.flag = hasFlag;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "hidden=" + hidden +
                ", hasFlag=" + flag +
                ", type='" + type + '\'' +
                '}';
    }
}
