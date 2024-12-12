package org.example.CodeBox;

public class Theater {
    private Seat[][] seats; // 전체 좌석
    private int rowCount;
    private int colCount;

    public Theater(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        seats = new Seat[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                seats[i][j] = new Seat();
            }
        }
    }
    // (5) 입력 문자 -> int 변환
    private int getRowIndex(char uppercaseChar) {
        return uppercaseChar - 'A';
    }
    // (1) 예약 메소드
    public boolean reserve(String name, char rowChar, int col, int numSeat) {
        if(rowChar - 'A' > rowCount || rowChar < 'A' || col > colCount || (col+numSeat-1) > colCount || col < 0)
            return false;

        for(int i=col-1; i<col+numSeat-1; i++) {
            if(seats[getRowIndex(rowChar)][i].isOccupied())
                return false;
        }

        for(int i=col-1; i<col+numSeat-1; i++) {
            seats[getRowIndex(rowChar)][i].reserve(name);
        }
        return true;
    }
    // (2) 취소 메소드 - 취소된 좌석 수 반환
    public int cancel(String name) {
        int count = 0;
        for(int i=0; i<rowCount; i++) {
            for(int j=0; j<colCount; j++) {
                if(seats[i][j].isOccupied()) {
                    if(seats[i][j].match(name)) {
                        seats[i][j].cancel();
                        count++;
                    }
                }
            }
        }
        return count;
    }
    // (3) 취소 메소드 - 열, 행, 좌석수에 맞는 모든 좌석 예약 취소 후 개수 반환
    public int cancel(char rowChar, int col, int numSeat) {
        int count = 0;
        for(int i=col-1; i<col+numSeat-1; i++) {
            if(i >= colCount) break;

            if(seats[getRowIndex(rowChar)][i].isOccupied()) {
                seats[getRowIndex(rowChar)][i].cancel();
                count++;
            }
        }
        return count;
    }
    // (4) 예약된 모든 좌석 수 리턴
    public int getNumberOfReservedSeat() {
        int count = 0;
        for(int i=0; i<rowCount; i++) {
            for(int j=0; j<colCount; j++) {
                if(seats[i][j].isOccupied()) count++;
            }
        }
        return count;
    }



    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
}
