class Product {
    int pid;
    String pname;
    int qty;

    Product(int pid, String pname, int qty) {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
    }

    void display() {
        System.out.println(pid + " " + pname + " " + qty);
    }
}
