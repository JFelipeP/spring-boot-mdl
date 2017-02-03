function callLink(object) {
	object.click();
}

function createDialog() {
	
	//let id = 0;
	let link;
	let confirmDelete = false;
	
	const dialog = document.querySelector('dialog');	
	let dialogs = $('.show-dialog');	
	
	if (!dialog.showModal) {
		console.log('dialog element not supported natively. using polyfill')
		dialogPolyfill.registerDialog(dialog);
	}
	
	for(a of dialogs) {
		//console.log(a);	
				
		
		// when dialog is opened
		a.addEventListener('click',function(e) {
			if (confirmDelete == false) {
				e.preventDefault();	
				
				//id = this.getAttribute('data-id');	
				link = this;				
				dialog.showModal();
			}			
			
			confirmDelete = false;
					
			
		});		
		
	}
	
	// on cancel
	dialog.querySelector('.close').addEventListener('click', e => {
		dialog.close();
	});
	
		
	// on delete
	dialog.querySelector('.delete').addEventListener('click', e => {
		console.log('delete action called');
		dialog.close();
		
		confirmDelete = true;
		window.setTimeout(() => {
			callLink(link);
		}, 500);
		
	});
	

}  // create dialog

function createToast() {
	const toast = document.querySelector('#toast');
	let dataMessage = toast.getAttribute('data-message'); 
	
	const data = {
			message: dataMessage ? dataMessage : 'placeholder for toast messages.',
			timeout: 3000,
			actionText: 'ok',
			actionHandler: function(event) {console.log('button ok clicked.')}
	};	
	
	toast.MaterialSnackbar.showSnackbar(data);	
	
}






//$(document).ready(function() {
//	createDialog();
//    createToast('Toast working!');
//	
//});

window.onload = () => {
	createDialog();
    createToast();
}

