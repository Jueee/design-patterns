using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Lexi.Lexi.UI.Show;
using Lexi.Lexi.Check;

namespace Lexi.Lexi.Element
{
    /// <summary>
    /// 图元
    /// </summary>
    public class Glyph
    {
        private CheckSpelling _CheckSpelling;
        public Glyph()
        { }
        public Glyph(CheckSpelling checkSpelling)
        {
            _CheckSpelling = checkSpelling;
        }

        protected virtual void CheckMe()
        {
            _CheckSpelling.CheckSpell();
        }
        /// <summary>
        /// 绘制自己
        /// </summary>
        /// <param name="window">绘制自己的工具</param>
        protected virtual void Draw(Window window) { }

        /// <summary>
        /// 然后自己的大小区域
        /// </summary>
        /// <param name="rect">自己所占有的区域大小</param>
        protected virtual void Bounds(object rect) { }
        /// <summary>
        /// 判断一个点是否与这个图元相交
        /// </summary>
        /// <param name="point">点</param>
        /// <returns></returns>
        protected virtual bool Intersects(object point) { return true; }
        /// <summary>
        /// 在index处插入一个子图元
        /// </summary>
        /// <param name="glyph">要插入的子图元</param>
        /// <param name="index">插入子图元的位置</param>
        protected virtual void Insert(Glyph glyph, int index) { }

        /// <summary>
        /// 删除子图元
        /// </summary>
        /// <param name="glyph">删除的图元</param>
        protected virtual void Remove(Glyph glyph) { }
        /// <summary>
        /// 返回子图元
        /// </summary>
        /// <param name="index">子图元的位置</param>
        /// <returns></returns>
        protected virtual Glyph Child(int index) { return new Glyph(); }
        /// <summary>
        /// 返回父图元
        /// </summary>
        /// <returns></returns>
        protected virtual Glyph Parent() { return new Glyph(); }
    }
}
