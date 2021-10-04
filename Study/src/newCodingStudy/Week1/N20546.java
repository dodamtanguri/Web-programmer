package newCodingStudy.Week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N20546 {
    static class Stock {
        int cash, cnt;

        public Stock(int cash, int cnt) {
            this.cash = cash;
            this.cnt = cnt;
        }

        void buyStock(int todayPrice, int buyingCnt) {
            if (this.cash < todayPrice * buyingCnt) {
                this.cnt += cnt;
                this.cash -= todayPrice * cnt;
            }
        }

        void sellStock(int todayPrice) {
            this.cash += todayPrice * this.cnt;
            this.cnt = 0;
        }


    }
    static int money; //준현이와 성민이에게 주어진 현금
    static int[] price; // MachinDuck 주가

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        money = Integer.parseInt(br.readLine());
        //1월 1일 부터 1월 14일까지
        StringTokenizer st = new StringTokenizer(br.readLine());
        price = new int[14];
        for (int i = 0; i < 14; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        int jun = jun();
        int sung = sung();

        if (jun > sung) {
            System.out.println("BNP");
        } else if (jun == sung) {
            System.out.println("SAMESAME");
        } else {
            System.out.println("TIMING");
        }
    }

    static int jun() {
        //한 번 산 주식은 다시 팔지 않음.
        //무조건 최대한 많이 삼
        Stock stock = new Stock(money, 0);
        for (int today : price) {
            int getCash = stock.cash;
            int buyingCnt = getCash / today;

            //풀매수
            if (buyingCnt > 0) {
                stock.buyStock(today, buyingCnt);
            }
        }
        return stock.cash + (stock.cnt * price[13]);
    }

    static int sung() {
        Stock stock = new Stock(money, 0);
        for (int i = 3; i < 14; i++) {
            int today = price[i];
            int getCash = stock.cash;
            int buyingCnt = getCash / today;
            if (price[i - 1] > price[i - 2] && price[i - 2] > price[i - 3]) {
                stock.sellStock(today);
            } else if (price[i - 1] < price[i - 2] && price[i - 2] < price[i - 3]) {
                stock.buyStock(today, buyingCnt);
            }
        }

        return stock.cash + (stock.cnt * price[13]);
    }
}
