<?php
    require "dbconnect.php";
    $product_name = json_decode($_GET['product_name']);
    $condition = '"'.implode('","',$product_name).'"';
    $get_product = "SELECT * FROM Product_FashionShop INNER JOIN Cart_FashionShop ON Product_FashionShop.product_name = Cart_FashionShop.product_name WHERE Cart_FashionShop.product_name IN ($condition)";
    $get_all_product_size = "SELECT * FROM Product_Size_FashionShop WHERE product_name IN ($condition)";
    $get_all_product_photo = "SELECT * FROM Product_Photo_FashionShop WHERE product_name IN ($condition)";
    $data_product = mysqli_query($connect,$get_product);
    $data_size = mysqli_query($connect,$get_all_product_size);
    $data_photo = mysqli_query($connect,$get_all_product_photo);
    $result_product = array();
    class Product{
        function Product($id,$product_name,$description,$price,$cost,$type,$subtype,$sizes,$photos){
            $this->id = $id;
            $this->product_name = $product_name;
            $this->description = $description;
            $this->price = $price;
            $this->cost = $cost;
            $this->type = $type;
            $this->subtype = $subtype;
            $this->sizes = $sizes;
            $this->photos = $photos;
        }
        function addSize($size){
            array_push($this->sizes,$size);
        }
        function addPhoto($photo){
            array_push($this->photos,$photo);
        }
    }
    class ProductSize{
        function ProductSize($size,$quantity){
            $this->size = $size;
            $this->quantity = $quantity;
        }
    }
    class ProductPhoto{
        function ProductPhoto($photo){
            $this->photo = $photo;
        }
    }
    while($row = mysqli_fetch_assoc($data_product)){
        array_push($result_product,new Product($row['product_id'],$row['product_name'],$row['description'],$row['price'],$row['cost'],$row['type'],$row['subtype'],array(),array()));
    }
    while($row = mysqli_fetch_assoc($data_size)){
        foreach($result_product as $product){
            if($row['product_name'] == $product->product_name){
                $product->addSize(new ProductSize($row['size'],$row['quantity']));
            }
        }
    }
    while($row = mysqli_fetch_assoc($data_photo)){
        foreach($result_product as $product){
            if($row['product_name'] == $product->product_name){
                $product->addPhoto($row['photo']);
            }
        }
    }
    echo json_encode($result_product);
?>