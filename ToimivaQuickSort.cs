using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SortTest
{
    class Program
    {
        private static void QuickSort(int[] a, int lo, int hi)
        {
            //  lo is the lower index, hi is the upper index
            //  of the region of array a that is to be sorted
            int i = lo, j = hi, h;

            // comparison element x
            int x = a[(lo + hi) / 2];

            //  partition
            do
            {
                while (a[i] < x) i++;
                while (a[j] > x) j--;
                if (i <= j)
                {
                    h = a[i];
                    a[i] = a[j];
                    a[j] = h;
                    i++; j--;
                }
            } while (i <= j);

            //  recursion
            if (lo < j) QuickSort(a, lo, j);
            if (i < hi) QuickSort(a, i, hi);
        }

        static void PrintTable(int[] t)
        {
            foreach (var item in t)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine("-----------------------------");
            Console.WriteLine();
        }

        static void Main(string[] args)
        {
            // taulukko
            int koko = 100000;
            int[] taulukko = new int[koko];

            // alustetaan taulukko satunnaisluvuilla
            Random gen = new Random();
            for (int i = 0; i < koko; i++)
            {
                taulukko[i] = gen.Next(1, koko);
            }

            //PrintTable(taulukko);

            DateTime before = DateTime.Now;
            QuickSort(taulukko, 0, koko - 1);
            DateTime after = DateTime.Now;
            TimeSpan diff = after - before;
            double ms = diff.TotalMilliseconds;
            Console.WriteLine(ms + " ms");

            //PrintTable(taulukko);

        }
    }
}
