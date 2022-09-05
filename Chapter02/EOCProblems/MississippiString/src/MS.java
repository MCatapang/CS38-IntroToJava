public class MS {
    private String name;

    public MS() {
        this.name = "Mississippi";
    }

    public static void main(String[] args) throws Exception {
        MS ms = new MS();
        ms.ReplaceI();
        ms.ReplaceSS();
    }

    public void ReplaceI() {
        String newStr = this.name.replaceAll("i", "ii");
        this.name = newStr;
        System.out.println(this.name.length());
    }

    public void ReplaceSS() {
        String newStr = this.name.replaceAll("ss", "s");
        this.name = newStr;
        System.out.println(this.name.length());
    }
}
