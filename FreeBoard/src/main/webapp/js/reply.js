/**
 * reply.js
 * replyService 생성했떤 메소드 활용
 * 
<table id="replyList" class="table">
 <thead>
  <tr>
   <th>댓글번호</th><th>내용</th><th>작성자</th>
  </tr>
 </thead>
 <tbody></tbody>
</table>
 */

svc.rlist(149//bno
	, function(result) {
		console.log(result);
		//작성
		for (let i = 0 ; i < result.length; i++){
			let tr = makeRow(result[i]);
			document.querySelector('#replyList tbody').appendChild(tr);
		}
		/*let obj = result[0];
		for (let i = 0; i< result.length; i++)
			for(let prop in obj) {
				console.log(result[i][prop]);
			}*/
	}//successFnc
	, function(err) {
		console.log('요기',err);
	} //errorFnc
)
function makeRow(obj = {}) {
	let fields = ['replyNo', 'reply', 'replyer'];
	let tr = document.createElement('tr');
	tr.setAttribute('data-id', obj.memberId);
	for (let j = 0; j < fields.length; j++) {
		let td = document.createElement('td');
		td.innerText = obj[fields[j]];
		tr.appendChild(td);
	}
	td = document.createElement('td');
	let btn = document.createElement('button');
	btn.addEventListener('click', deleteRowFnc);
	btn.innerHTML = '삭제';
	td.appendChild(btn);
	tr.appendChild(td);

	return tr;
}