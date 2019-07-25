using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Lexi.Lexi.UI.Show
{
    public class Window
    {
        private WindowsImp _WindowsImp;

        public Window(WindowsImp windowsImp)
        {
            this._WindowsImp = windowsImp;
        }
        public void DrawRect()
        {
            _WindowsImp.DrawRect();
        }
    }
}
