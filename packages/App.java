package bankingApp;

import banking.Account;

public class App extends Account {

    public void testMethods() {

        showPublic();      // ✔ accessible
        showProtected();   // ✔ accessible

        // showPrivate(); ❌ not accessible
    }

    public static void main(String[] args) {

        App obj = new App();
        obj.testMethods();
    }
}