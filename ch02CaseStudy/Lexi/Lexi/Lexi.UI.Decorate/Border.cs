using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Lexi.Lexi.UI.Show;

namespace Lexi.Lexi.UI.Decorate
{
    public class Border : MonoGlyph
    {
        protected override void Draw(Window window)
        {
            base.Draw(window);
            _BorderDraw(window);
        }

        private void _BorderDraw(Window window)
        {

        }
    }
}
