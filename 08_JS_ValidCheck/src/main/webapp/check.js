function call() {
	let i1Input = document.myForm.i1;
	let i2Input = document.myForm.i2;
	let i3Input = document.myForm.i3;
	let i4Input = document.myForm.i4;
	let i5Input = document.myForm.i5;

	if (isEmpty(i1Input) || lessThan(i1Input, 3) || containKR(i1Input)) {
		alert('필수 입력 에러');
		
		i1Input.focus();
		i1Input.value = "";
		
		return false;
	}
	
	if (lessThan(i2Input, 3)) {
		alert('글자수 에러');
		
		i2Input.focus();
		i2Input.value = "";
		
		return false;
	}
	
	if (lessThan(i3Input, 5)) {
		alert('양식을 맞춰주세요.');
		
		i3Input.focus();
		i3Input.value = "";
		
		return false;
	}
	
	if (notContains(i3Input, "1234567890") 
		|| notContains(i3Input, "QWERTYUIOPASDFGHJKLZXCVBNM")) {
		alert('대문자, 숫자를 넣어주세요');
		
		i3Input.focus();
		i3Input.value = "";
		
		return false;
	}
		
	if (notEquals(i3Input, i4Input)) {
		alert('비번이 일치하지 않습니다.');
		
		i3Input.focus();
		i3Input.value = "";
		i4Input.value = "";
		
		return false;
	}
	
	if (isNotNumber(i5Input) || isEmpty(i5Input)) {
		alert('숫자를 입력해주세요.');
		
		i5Input.focus();
		i5Input.value = "";
		
		return false;
	}
	
	return true;
	
}