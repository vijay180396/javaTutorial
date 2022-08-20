class InstancesInit {
    int speed;

    InstancesInit() {
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer block invoked");
    }

    {
        System.out.println("Baby");
    }

    static {
        System.out.println("Static block");
    }
    public static void main(String args[]) {
        InstancesInit b1 = new InstancesInit();
        InstancesInit b2 = new InstancesInit();
    }
}