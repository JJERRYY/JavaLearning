public enum Pay implements Message{

    Cash("Cash"),WeChatPay("WeChatPay"),Alipay("Alipay"),BankCard("BankCard"),CreditCard("CreditCard");

    final String type;
    double mount;
    Pay(String type){
        this.type=type;
    }


    @Override
    public void show() {
        System.out.println(type + "支付" + mount);
    }

    public static void main(String[] args) {

        Pay cash =Pay.Cash;
        cash.mount=1000;
        cash.show();

        Pay ali =Pay.Alipay;
        ali.mount=2000;
        ali.show();

        Pay bank =Pay.BankCard;
        bank.mount=2000;
        bank.show();

        Pay credit =Pay.CreditCard;
        credit.mount=2000;
        credit.show();

        Pay weChatPay =Pay.WeChatPay;
        weChatPay.mount=2000;
        weChatPay.show();
    }
}
