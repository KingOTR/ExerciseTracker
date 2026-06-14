package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Books.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Books", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBooks", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_books", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BooksKt {
    private static ImageVector _books;

    public static final ImageVector getBooks(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _books;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Books", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(231.65f, 194.55f);
        pathBuilder.lineTo(198.46f, 36.75f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -19.0f, -12.39f);
        pathBuilder.lineTo(132.65f, 34.42f);
        pathBuilder.arcToRelative(16.08f, 16.08f, 0.0f, false, false, -12.3f, 19.0f);
        pathBuilder.lineToRelative(33.19f, 157.8f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 169.16f, 224.0f);
        pathBuilder.arcToRelative(16.25f, 16.25f, 0.0f, false, false, 3.38f, -0.36f);
        pathBuilder.lineToRelative(46.81f, -10.06f);
        pathBuilder.arcTo(16.09f, 16.09f, 0.0f, false, false, 231.65f, 194.55f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 50.15f);
        pathBuilder.curveToRelative(0.0f, -0.06f, 0.0f, -0.09f, 0.0f, -0.09f);
        pathBuilder.lineToRelative(46.8f, -10.0f);
        pathBuilder.lineToRelative(3.33f, 15.87f);
        pathBuilder.lineTo(139.33f, 66.0f);
        pathBuilder.close();
        pathBuilder.moveTo(142.62f, 81.62f);
        pathBuilder.lineTo(189.44f, 71.57f);
        pathBuilder.lineTo(192.78f, 87.47f);
        pathBuilder.lineTo(146.0f, 97.53f);
        pathBuilder.close();
        pathBuilder.moveTo(149.26f, 113.19f);
        pathBuilder.lineTo(196.08f, 103.13f);
        pathBuilder.lineTo(209.38f, 166.37f);
        pathBuilder.lineTo(162.56f, 176.43f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 197.94f);
        pathBuilder.lineToRelative(-46.8f, 10.0f);
        pathBuilder.lineToRelative(-3.33f, -15.87f);
        pathBuilder.lineTo(212.67f, 182.0f);
        pathBuilder.lineTo(216.0f, 197.85f);
        pathBuilder.curveTo(216.0f, 197.91f, 216.0f, 197.94f, 216.0f, 197.94f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 32.0f);
        pathBuilder.lineTo(56.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 48.0f);
        pathBuilder.lineTo(40.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(120.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.lineTo(104.0f, 64.0f);
        pathBuilder.lineTo(56.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.lineTo(56.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 208.0f);
        pathBuilder.lineTo(56.0f, 208.0f);
        pathBuilder.lineTo(56.0f, 192.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _books = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
