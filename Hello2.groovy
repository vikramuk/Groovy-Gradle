class Hello {

    String name;
    
    void sayHello() {
        System.out.println("Hello "+getName()+"!");
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    String getName() {
        return name;
    }
    
    static void main(String[] args) {
    
        Hello hello = new Hello();
        hello.setName("world");
        hello.sayHello();
    }
}
