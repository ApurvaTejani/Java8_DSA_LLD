package Methods_Java.Exercise;

import java.lang.Math;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2) + " Buckets needs to be bought");
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1) + " Buckets needs to be bought");
        System.out.println(getBucketCount(3.4, 2.1, 1.5) + " Buckets needs to be bought");
        System.out.println(getBucketCount(7.25, 4.3, 2.35) + " Buckets needs to be bought");
        System.out.println(getBucketCount(3.26, 0.75) + " Buckets needs to be bought");
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket <= 0)
            return -1;
        else {
            double area = width * height;
            double bucketRequried = area / areaPerBucket;
            int actualBucketReq = (int) (Math.ceil(bucketRequried - extraBucket));
            return actualBucketReq;
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;
        else {
            double area = width * height;
            int bucketRequried = (int) (Math.ceil(area / areaPerBucket));
            return bucketRequried;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0)
            return -1;
        else {
            int bucketRequried = (int) (Math.ceil(area / areaPerBucket));
            return bucketRequried;
        }
    }
}
