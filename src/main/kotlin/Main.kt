
fun getSmallest(n1:Double,n2:Double,n3:Double):Double{
    var smallNumber=n1
    if (smallNumber >= n2) {
        smallNumber = n2
    }
    if (smallNumber >= n3) {
        smallNumber = n3
    }
    System.out.println(smallNumber)
}
fun getBiggest(n1:Double,n2:Double,n3: Double):Double{
    var biggest = n1
    if (biggest <= n2) {
        biggest = n2
    }
    if (biggest <= n3) {
        biggest = n3
    }
  System.out.println(biggest)
}
fun getMid(n1:Double,n2:Double,n3:Double):Double{
    var mid = 0.0
    if ((n1 < n2 && n1 > n3) || (n1 > n2 && n1 < n3)) {
        mid = n1
    }
    if ((n2 < n1 && n2 > n3) || (n2 > n1 && n2 < n3)) {
        mid = n2
    }
    if ((n3 < n1 && n3 > n2) || (n3 > n1 && n3 < n2)) {
        mid = n3
    }

    { System.out.println(mid)
}
fun getEasyMid(n1:Double,n2:Double,n3:Double):Double{
    var biggest=getBiggest(n1, n2, n3)
    var smallest=getSmallest(n1, n2, n3)

    var mid=0.0
    if (n1 < biggest && n1 > smallest) {
        mid = n1
    } else if (n2 < biggest && n2 > smallest) {
        mid = n2
    } else {
        mid = n3
    }
    System.out.println(mid)
}