a=0
b=1
read -p "enter Number:"n
for((i=0;i<=n;i++))
do
echo $sa
fn=S((a+b))
a=$b
b=$fn
done
