package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1=new MovieReview();
        movieReview1.title="서울의 봄";
        movieReview1.review="재밌었다.";
        MovieReview movieReview2=new MovieReview();
        movieReview2.title="라라랜드";
        movieReview2.review="재밌었음";
        System.out.println("제목 : "+movieReview1.title+" 리뷰 : "+movieReview1.review);
        System.out.println("제목 : "+movieReview2.title+" 리뷰 : "+movieReview2.review);

    }
}
