function call() {
	
	let x = document.getElementById('x');
	let y = document.getElementById('y');
	let c = document.getElementById('c');
	
	if (isEmpty(x) || isNotNumber(x)) {
		alert('입력을 다시 해주세요')
	
		x.focus();
		x.value = "";
	
		return false;	
	}
	
	if (isEmpty(y) || isNotNumber(y)) {
		alert('입력을 다시 해주세요')
	
		y.focus();
		y.value = "";
	
		return false;	
	}
	
	return true;
		
}