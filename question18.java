class Question18 {
    public static void myr(int n) {
        long ct = System.currentTimeMillis();
        int[] pa = {2, 5, 7, 11, 13, 17};
        int mxv = 100;
        System.out.println("GENERATED Random Numbers:");

        for (int i = 0; i < n; i++) {
            int index = i % pa.length;
            int rdn = (int) ((ct * pa[index]) % mxv);
            System.out.println(rdn);
        }
    }

    public static int myrand() {
        long ct = System.currentTimeMillis();
        int[] pda = {3, 5, 7, 11, 13, 17};
        int mxv = 100;

        // ✅ index এখন সর্বদা 0 থেকে 5 এর মধ্যে থাকবে
        int index = (int) (ct % pda.length);

        return (int) ((ct * pda[index]) % mxv);
    }

    public static void main(String[] args) {
        myr(5); // ✅ সঠিক মেথড কল করা হলো
        System.out.println("Single random number: " + myrand()); // ✅ বানান ঠিক করা হলো
    }
}
