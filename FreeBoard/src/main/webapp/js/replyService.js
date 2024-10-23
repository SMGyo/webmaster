/**
 * replyService.js
 * 메소드: 목록, 등록, 삭제
 */
const svc = {
	//1. 목록
	rlist(bno = 1, successFnc, errorFnc) {
		//목록
		//Ajax 호출.
		fetch('replyList.do?bno=' + bno)
			.then(resolve => resolve.json())
			.then(successFnc)
			.catch(errorFnc)
	}
}