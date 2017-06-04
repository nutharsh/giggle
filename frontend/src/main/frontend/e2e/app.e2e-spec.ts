import { Ng2bootPage } from './app.po';

describe('ng2boot App', () => {
  let page: Ng2bootPage;

  beforeEach(() => {
    page = new Ng2bootPage();
  });

  it('should display welcome message', done => {
    page.navigateTo();
    page.getParagraphText()
      .then(msg => expect(msg).toEqual('Welcome to app!!'))
      .then(done, done.fail);
  });
});
