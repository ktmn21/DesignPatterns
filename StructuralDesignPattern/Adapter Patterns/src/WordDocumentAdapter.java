public class WordDocumentAdapter implements DocumentUploader{
    private final WordDocumentUploader wordDocumentUploader;

    public WordDocumentAdapter(){
        wordDocumentUploader = new WordDocumentUploader();
    }

    @Override
    public void upload() {
        wordDocumentUploader.uploadWordDocument();
    }
}
