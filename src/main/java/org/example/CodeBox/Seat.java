package org.example.CodeBox;

public class Seat {
    private String name;    // 예약자 이름

    public String getName() {
        return name;
    }
    // 예약자 이름 설정
    public void reserve(String name) {
        this.name = name;
    }
    // 예약 취소
    public void cancel() {
        this.name = null;
    }
    public boolean isOccupied() {
        return this.name != null;
    }
    public boolean match(String checkName) {
        return this.name.equals(checkName);
    }
}
