package NowCoder;

import java.util.*;

public class BuyOrNo {



        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            String sales=in.nextLine();
            String hers=in.nextLine();
            judge(sales,hers);
        }
        public static void judge(String sale,String hers)
        {
            HashMap<Character,Integer> sales=new HashMap<>();
            HashMap<Character,Integer> buy=new HashMap<>();

            char[] saleChar=sale.toCharArray();
            char[] buys=hers.toCharArray();
            for(int i=0;i<saleChar.length;i++)
            {
                if(sales.get(saleChar[i])==null)
                {
                    sales.put(saleChar[i],1);
                }
                else sales.put(saleChar[i],sales.get(saleChar[i])+1);

            }
            for(int i=0;i<buys.length;i++)
            {
                if(buy.get(buys[i])==null)
                {
                    buy.put(buys[i],1);
                }
                else buy.put(buys[i],buy.get(buys[i])+1);
            }
//卖的比买的多了几个
            int less=0;
            int more=0;
            boolean flag=true;
            for(char c:buy.keySet())
            {//卖的少了
                if(sales.get(c)==null)
                { flag=false;
                    less=buy.get(c)+less;}
                else
                //卖的多了
                {if(sales.get(c)>buy.get(c))
                    more=more+(sales.get(c)-buy.get(c));
                else
                {flag=false;
                    less=less+(buy.get(c)-sales.get(c));}
                }}
            if(!flag) System.out.println("No"+" "+less);
            else System.out.println("Yes"+" "+more);
        }
    }