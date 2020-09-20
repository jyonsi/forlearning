package com.marshal.springframework.aop;

/**
 * @Author 王毅
 * @Date 2020/2/29 11:09
 */
public class Story {

    private Customer customer;
    private TaoistPriest taoistPriest;
    private Servant servant;
    private OridinaryPeople oridinaryPeople;

    public Story(Customer customer, TaoistPriest taoistPriest, Servant servant, OridinaryPeople oridinaryPeople) {
        this.customer = customer;
        this.taoistPriest = taoistPriest;
        this.servant = servant;
        this.oridinaryPeople = oridinaryPeople;
    }

    public void xunZhaoMuXue(){

        customer.inventation();
        taoistPriest.xunlongdianxue();
        servant.clean();
        oridinaryPeople.eulogize();
    }

    public void xiaoMieJiangShi(){

        customer.inventation();
        taoistPriest.xiangyaochumo();
        servant.clean();
        oridinaryPeople.eulogize();
    }

    public void daoMu(){

        customer.inventation();
        taoistPriest.daomujuebao();
        servant.clean();
        oridinaryPeople.eulogize();
    }

    public static void main(String[] args) {

        Story story = new Story(new Customer(), new TaoistPriest(), new Servant(), new OridinaryPeople());

        story.xunZhaoMuXue();
        story.xiaoMieJiangShi();
        story.daoMu();
    }
}
