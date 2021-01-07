<?php
// Calculator Add Function
function add($x, $y)
{
	try{
		return $x+$y;
	}
	catch(Exception $e) {
		echo 'Message: ' .$e->getMessage();
		return 0;
	  }
}
