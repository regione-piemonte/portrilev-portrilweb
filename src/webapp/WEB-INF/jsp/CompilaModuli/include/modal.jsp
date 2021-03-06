<%--
SPDX-FileCopyrightText: Copyright 2020 | Regione Piemonte
SPDX-License-Identifier: EUPL-1.2
--%>

<!-- Modal annulla ok -->
<div id="msgAnnulla" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="msgAnnullaLabel" aria-hidden="true">
  <div class="modal-body">
	<div class="alert alert-error">
	  <button type="button" class="close" data-dismiss="alert">&times;</button>
	  <p><strong>Attenzione!</strong></p>
	  <p><strong>Elemento selezionato:.....</strong></p>
	  <p>Stai per annullare l'elemento selezionato......<br>Sei sicuro di voler proseguire?</p>
	</div>
  </div>
  <div class="modal-footer">
	<button class="btn" data-dismiss="modal" aria-hidden="true">no, indietro</button>
	<button class="btn btn-primary">si, prosegui</button>
  </div>
</div>  
<!--/modale annulla -->

<!-- Modal elimina -->
<div id="msgElimina" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="msgEliminaLabel" aria-hidden="true">
		
		  <div class="modal-body">
			<div class="alert alert-error">
			  <button type="button" class="close" data-dismiss="alert">&times;</button>
			  <p><strong>Attenzione!</strong></p>
			  <p><strong>Elemento selezionato:.....</strong></p>
			  <p>Stai per eliminare l'elemento selezionato: sei sicuro di voler proseguire?</p>
			</div>
		  </div>
		  <div class="modal-footer">
			<button class="btn" data-dismiss="modal" aria-hidden="true">no, indietro</button>
			<button class="btn btn-primary">si, prosegui</button>
		  </div>
</div>  
<!--/modale elimina -->


<!-- Modal msgInvia -->
<div id="msgInvia" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="msgInviaLabel" aria-hidden="true">
		
	<div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
         <h4 class="nostep-pane">Invia Modulo</h4>
	</div>
	<div class="modal-body">
		<fieldset class="form-horizontal">
		<h4>Modulo ABSN-00015</h4>
		<h4>Descrizione: xxxxxxxxxxxx  xxxxxxxxxxxxxxxxxx xxxxxxx xxxxxxxxxxxx xxxxxxxxx</h4>
		<div class="BordersLine1 colorGreen"></div>
		<br>
		<div class="control-group">
			<label class="control-label" for="oggMailModulo">Oggetto</label>
			<div class="controls">
				<input id="oggMailModulo" class="lbTextSmall span10" type="text" value="" name="oggMailModulo" />	
																	
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="DescMailModulo">Testo</label>
			<div class="controls">
				<textarea id="DescMailModulo" rows="3" cols="15" class="span10" type="text" value="" name="DescMailModulo" ></textarea>
			</div>
		</div>
		</fieldset>
	  
	</div>
	<div class="modal-footer">
		<button class="btn btn-secondary">annulla</button>
		<button class="btn btn-primary">invia</button>
	</div>
</div>  
<!--/modale msgInvia -->

<!-- Modal aggColonna -->
<div id="aggColonna" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="msgInviaLabel" aria-hidden="true">
		
	<div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
         <h4 class="nostep-pane">Aggiorna colonna</h4>
	</div>
	<div class="modal-body">
		<fieldset class="form-horizontal">        
			<div class="control-group">
				<label class="control-label" >Codice Colonna</label>
				<div class="controls">
					<input id="codColonna" name="codColonna" class="span2" type="text" value="xxxxx" />
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label" >Etichetta Colonna</label>
				<div class="controls">
					<input id="eticColonna" name="eticColonna" class="span9" type="text" value="xxx" />
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label" >Posizione</label>
				<div class="controls">
					<input id="posColonna" name="posColonna" class="span1" type="text" value="x" />
				</div>
			</div>
			
			<div class="control-group">
				<span class="control-label">Obbligatorio</span>
				<div class="controls">
					<label class="radio inline">
						<input type="radio" name="optionsRadiosObb" value="SI" id="optionsRadioObb1" checked="checked">
						si
				  </label>
					 <label class="radio inline">
						<input type="radio" name="optionsRadiosObb" value="NO" id="optionsRadioObb2">
						no
					 </label>
				</div>
			</div>
			
			<div class="control-group">
				<span class="control-label">Profilo</span>
				<div class="controls">
					<label class="radio inline">
						<input type="radio" name="optionsRadiosProfile" value="COMPILATORE" id="optionsProfile1">
						Compilatore 
				  </label>
					 <label class="radio inline">
						<input type="radio" name="optionsRadiosProfile" value="VALIDATORE" id="optionsProfile2">
						Validatore
					 </label>
				</div>
			</div>
	</fieldset>
									
	  
	</div>
	<div class="modal-footer">
		<button class="btn btn-secondary" data-dismiss="modal" aria-hidden="true">annulla</button>
		<button class="btn btn-primary" data-dismiss="modal" aria-hidden="true">conferma</button>
	</div>
</div>  
<!--/modale aggColonna -->



