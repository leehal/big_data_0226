package 상속적용TV;
// 시제품 TV를 만들고, 상속 받아 기능이 개선된 양산용 TV 만들기

public class InheritanceTv {
    public static void main(String[] args) {
        ProductTv productTv =new ProductTv();
        ProductTv lgTv =new ProductTv("My home Tv");
        lgTv.setPower(true);
        lgTv.setVolume(90);
        lgTv.setChannel(1500,true);
        lgTv.viewTV();

    }
}
