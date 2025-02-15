class SimpleBank {
    Map<Integer, Long> accounts = new ConcurrentHashMap<>();

    public SimpleBank(long[] balance) {
        for (int i = 0; i < balance.length; i++) {
            accounts.put(i + 1, balance[i]);
        }
    }

    public boolean transfer(int account1, int account2, long money) {
        if (accounts.containsKey(account1) && accounts.containsKey(account2) && accounts.get(account1) >= money) {
            accounts.compute(account1, (k, v) -> v - money);
            accounts.compute(account2, (k, v) -> v + money);

            return true;
        }

        return false;
    }


    public boolean deposit(int account, long money) {
        if (accounts.containsKey(account)) {
            accounts.compute(account, (k, v) -> v + money);
            return true;
        }
        return false;
    }

    public boolean withdraw(int account, long money) {
        if (accounts.containsKey(account)) {
            if (accounts.get(account) >= money) {
                accounts.compute(account, (k, v) -> v - money);

                return true;
            }
        }
        return false;
    }
}
