import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.omg.Messaging.*;
import org.eclipse.wb.swt.SWTResourceManager;
public class Ciao {

	protected Shell shell;
	private Text txtParola;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Ciao window = new Ciao();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("SketchFlow Print", 26, SWT.NORMAL));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtParola.setText (txtParola.getText()+"ciao");
			}
		});
		btnNewButton.setBounds(20, 237, 75, 25);
		btnNewButton.setText("bottone");
		
		txtParola = new Text(shell, SWT.BORDER | SWT.READ_ONLY);
		txtParola.setFont(SWTResourceManager.getFont("Wingdings 3", 15, SWT.NORMAL));
		txtParola.setText("parola");
		txtParola.setBounds(10, 10, 401, 221);

	}
}
