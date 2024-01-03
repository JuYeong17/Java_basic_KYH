package class1;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview movieReview1=new MovieReview();
        movieReview1.title="서울의 봄";
        movieReview1.review="재밌었다.";
        MovieReview movieReview2=new MovieReview();
        movieReview2.title="라라랜드";
        movieReview2.review="재밌었음";
        MovieReview[] movieReviews={movieReview1,movieReview2};
        for(MovieReview m:movieReviews){
            System.out.println("제목 : "+m.title+" 리뷰 : "+m.review);

        }
    }
}
