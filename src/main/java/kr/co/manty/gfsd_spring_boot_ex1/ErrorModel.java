package kr.co.manty.gfsd_spring_boot_ex1;


public class ErrorModel {
    private String message;

    public String getMessage() {
        return message;
    }

    public ErrorModel(String message) {
        this.message = message;
    }
}