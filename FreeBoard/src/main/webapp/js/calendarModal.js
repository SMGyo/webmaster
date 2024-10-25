/**
 * calendarModal.js
 */
function modalShow(arg) {
	modalArg = arg; //여러 함수에서 사용할 용도.
	//body태그	
	let body = document.querySelector('body');

	body.className = 'modal-open';
	body.style.overflow = 'hidden';
	body.style.paddingRight = '16px';

	let div = document.createElement('div');
	div.className = 'modal-backdrop fade show';

	body.appendChild(div);
	// modal 태그
	let modal = document.querySelector('#exampleModal');
	modal.classList.add('show');
	modal.setAttribute('aria-modal', true);
	modal.setAttribute('role', 'dialog');
	modal.removeAttribute('aria-hidden','none');
	modal.style.display = 'block';

	// title.value = title;
	start.value = modalArg.startStr;
	end.value = modalArg.endStr;
}
function modalHide() {
	//body속성.
	let body = document.querySelector('body');
	document.querySelector('.modal-backdrop').remove();
	body.removeAttribute('style');
	body.removeAttribute('class');
	//div속성
	let modal = document.querySelector("#exampleModal");
	modal.classList.remove('show');
	modal.removeAttribute('aria-modal');
	modal.removeAttribute('role');
	modal.setAttribute('aria-hidden',true);
	modal.style.display = 'none';
	//back-drop속성.
}
function modalSave() {
	//title , startStr, endStr
//	let ti = document.querySelector("#title");
//	let title = ti.value;
	let title = document.querySelector("#title").value;
	//let title = modalArg.title;
	let startStr = document.querySelector("#start").value;
	let endStr = document.querySelector("#end").value;
	fetch('addEvent.do?job=add&title=' + title + '&start=' + startStr + '&end=' + endStr)
		.then(resolve => resolve.json())
		.then(result => {
			console.log(result);
			if (result.retCode == 'OK') {
				//화면에 출력
				calendar.addEvent({
					title: title,
					start: modalArg.start,
					end: modalArg.end,
					allDay: modalArg.allDay
				})//화면출력
				modalHide();
			} else if (result.retCode == 'FAIL') {
				alert('등록 에러');
			}


		})
		.catch(err => console.log(err));
		
}

function startChange(event){
	console.log(event);
	modalArg.start = new Date(event.target.value); // 2024-10-21
	
}
function endChange(event){
	console.log(event);
	moqdalArg.end = new Date(event.target.value);
}