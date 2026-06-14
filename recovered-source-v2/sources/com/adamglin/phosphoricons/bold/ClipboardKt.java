package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Clipboard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Clipboard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getClipboard", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_clipboard", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClipboardKt {
    private static ImageVector _clipboard;

    public static final ImageVector getClipboard(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _clipboard;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Clipboard", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 28.0f);
        pathBuilder.horizontalLineTo(165.47f);
        pathBuilder.arcToRelative(51.88f, 51.88f, 0.0f, false, false, -74.94f, 0.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 48.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(155.71f, 60.0f);
        pathBuilder.horizontalLineTo(100.29f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 55.42f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 212.0f);
        pathBuilder.horizontalLineTo(60.0f);
        pathBuilder.verticalLineTo(52.0f);
        pathBuilder.horizontalLineTo(77.41f);
        pathBuilder.arcTo(52.13f, 52.13f, 0.0f, false, false, 76.0f, 64.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 84.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcToRelative(52.13f, 52.13f, 0.0f, false, false, -1.41f, -12.0f);
        pathBuilder.horizontalLineTo(196.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _clipboard = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
